package lan.jing.backend.entry

import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import java.time.LocalDateTime

data class Role(
    @Id(keyType = KeyType.Auto)
    var id: Int? = null,
    var uid: Int? = null,
    var name: String? = null,
    var description: String? = null,
    var createTime: LocalDateTime? = null,
    var updateTime: LocalDateTime? = null
)
