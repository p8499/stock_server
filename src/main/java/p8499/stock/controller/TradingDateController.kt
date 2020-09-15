package p8499.stock.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import p8499.stock.FilterExpr
import p8499.stock.OrderByListExpr
import p8499.stock.bean.TradingDate
import p8499.stock.controller.base.TradingDateControllerBase
import p8499.stock.mask.TradingDateMask
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

@RestController
class TradingDateController : TradingDateControllerBase() {
    override fun onGet(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int, mask: TradingDateMask): TradingDate? {
        //无此对象，返回404
        val bean = tradingDateService[trid, mask] ?: run { response.status = HttpServletResponse.SC_NOT_FOUND; return null }
        //处理
        return bean
    }

    override fun onAdd(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, bean: TradingDate?): TradingDate? {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return null }
    }

    override fun onUpdate(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int, bean: TradingDate?, mask: TradingDateMask): TradingDate? {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return null }
    }

    override fun onDelete(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int) {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return }
    }

    override fun onCount(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, filter: FilterExpr?): Long? {
        //处理
        return tradingDateService.count(filter)
    }

    override fun onQuery(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, filter: FilterExpr?, orderByList: OrderByListExpr?, start: Long, count: Long, mask: TradingDateMask): MutableList<TradingDate> {
        //处理
        return tradingDateService.query(filter, orderByList, start, count, mask)
    }

    override fun onReadAttachment(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int, name: String?): ByteArray? {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return null }
    }

    override fun onWriteAttachment(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int, name: String?, bytes: ByteArray) {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return }
    }

    override fun onDeleteAttachment(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int, name: String?) {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return }
    }

    override fun onListAttachments(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse, trid: Int): MutableList<String> {
        //不提供此方法，返回404
        kotlin.run { response.status = HttpServletResponse.SC_NOT_FOUND; return mutableListOf() }
    }

    @CrossOrigin(origins = [(TradingDateControllerBase.html)], allowCredentials = "true")
    @RequestMapping(value = [TradingDateControllerBase.path + "_sync"], method = [RequestMethod.GET, RequestMethod.POST], produces = ["application/json;charset=UTF-8"])
    fun sync(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse) {
        //处理
        val proc = Runtime.getRuntime().exec("python $pythonSourceFolder/trading_date.py")
        proc.waitFor()
    }

    @Value(value = "\${app.pythonSourceFolder}")
    lateinit var pythonSourceFolder: String
}