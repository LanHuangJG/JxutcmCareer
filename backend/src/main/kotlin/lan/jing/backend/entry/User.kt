package lan.jing.backend.entry

import com.github.xiaoymin.knife4j.annotations.Ignore
import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import com.mybatisflex.annotation.RelationOneToMany
import java.time.LocalDateTime

data class User(
    @Id(keyType = KeyType.Auto)
    var id: Int? = null,
    var username:String? = null,
    var password:String? = null,
    var email:String? = null,
    var createTime:LocalDateTime? = null,
    var updateTime:LocalDateTime? = null,
    @Ignore
    @RelationOneToMany(selfField = "id", targetField = "uid")
    var roles: List<Role>? = null,
    @Ignore
    @RelationOneToMany(selfField = "id", targetField = "uid")
    var permissions: List<Permission>? = null
)
