package com.forums.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenVO {
    private String uid;
    /** 用户名 */
    private String username;

    /** 用户邮箱 */
    private String email;

    /** 用户头像链接 */
    private String headImage;

    /** token */
    private String token;
}
