package ai.chat2db.server.admin.api.controller.user.request;

import ai.chat2db.server.domain.api.enums.RoleCodeEnum;
import ai.chat2db.server.domain.api.enums.ValidStatusEnum;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * create
 *@author Jiaju Zhuang
 */
@Data
public class UserUpdateRequest {
    /**
     * 主键
     */
    @NotNull
    private Long id;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    @NotNull
    private String nickName;

    /**
     * 邮箱
     */
    @NotNull
    private String email;


    /**
     * 角色编码
     *
     * @see RoleCodeEnum
     */
    private String roleCode;

    /**
     * 用户状态
     *
     * @see ValidStatusEnum
     */
    @NotNull
    private String status;
}
