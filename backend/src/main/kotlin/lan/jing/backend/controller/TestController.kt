package lan.jing.backend.controller

import com.mybatisflex.kotlin.extensions.db.all
import com.mybatisflex.kotlin.extensions.db.query
import io.swagger.v3.oas.annotations.tags.Tag
import lan.jing.backend.entry.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
@RestController
@Tag(name = "测试接口")
class TestController {
    data class JingResponse(
        val code: Int,
        val message: String,
        val users: List<Map<String,String>>
    )

    @GetMapping("/jing")
    fun jing(): JingResponse {
        return JingResponse(
            200,
            "成功",
            all<User>().map {
                mapOf(
                    "username" to it.username.toString(),
                    "password" to it.password.toString(),
                    "email" to it.email.toString(),
                )
            }
        )
    }
}