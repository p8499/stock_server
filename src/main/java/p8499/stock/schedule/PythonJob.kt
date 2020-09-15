package p8499.stock.schedule

import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import p8499.stock.bean.ObjectUpdate
import p8499.stock.mask.ObjectUpdateMask
import p8499.stock.service.ObjectUpdateService
import java.util.*

@Component("pythonJob")
open class PythonJob {
    @Scheduled(cron = "0 0 18 ? * MON-FRI")
    fun runJobs() {
        runJob("exchange", "exchange.py")
        runJob("stock", "stock.py")
        runJob("category", "category.py")
        runJob("category_stock", "category_stock.py")
        runJob("trading_date", "trading_date.py")
        runJob("finance", "finance.py")
        runJob("message", "message.py")
        runJob("stock_day_1", "stock_day_1.py")
        runJob("manual_fields", "manual_fields.py")
    }

    private fun runJob(obname: String, script: String) {
        val bean = objectUpdateService.add(ObjectUpdate(null, obname, Date(), null))
        var rt = -1
        while (rt != 0) {
            rt = Runtime.getRuntime().exec("python $pythonSourceFolder/$script").waitFor()
        }
        objectUpdateService.update(bean.setObend(Date()), ObjectUpdateMask().setObend(true))
    }


    @Value(value = "#{objectUpdateService}")
    lateinit var objectUpdateService: ObjectUpdateService

    @Value(value = "\${app.pythonSourceFolder}")
    lateinit var pythonSourceFolder: String
}