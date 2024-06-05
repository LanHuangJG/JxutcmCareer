package lan.jing.backend.entry

import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import java.time.LocalDateTime

data class User(
    @Id(keyType = KeyType.Auto)
    var id: Int? = null,
    var username:String? = null,
    var password:String? = null,
    var email:String? = null,
    var createTime:LocalDateTime? = null,
    var updateTime:LocalDateTime? = null
)
