package lan.jing.backend.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
@RestController
@Tag(name = "测试接口")
class TestController {

    @GetMapping("/jing")
    fun jing() = "Hello, Jing!"
}