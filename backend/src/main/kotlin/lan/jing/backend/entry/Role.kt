package lan.jing.backend.entry

import com.github.xiaoymin.knife4j.annotations.Ignore
import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import com.mybatisflex.annotation.RelationOneToMany
import java.time.LocalDateTime

data class Role(
    @Id(keyType = KeyType.Auto)
    var id: Int? = null,
    var uid: Int? = null,
    var name: String? = null,
    var description: String? = null,
    var createTime: LocalDateTime? = null,
    var updateTime: LocalDateTime? = null,
    @Ignore
    @RelationOneToMany(selfField = "id", targetField = "rid")
    var permissions: List<Permission>? = null
)
