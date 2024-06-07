package lan.jing.backend

import com.mybatisflex.kotlin.extensions.db.insert
import lan.jing.backend.entry.User
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@SpringBootTest
class BackendApplicationTests {

    @Test
    fun contextLoads() {
        insert(
            User(
                username = "wen",
                password = "123456",
                email = "211@qq.com",
                createTime = LocalDateTime.now(),
                updateTime = LocalDateTime.now()
            )
        )
    }

}
