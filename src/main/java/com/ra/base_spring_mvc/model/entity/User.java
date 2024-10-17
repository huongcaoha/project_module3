package com.ra.base_spring_mvc.model.entity;

import com.ra.base_spring_mvc.validator.user.PhoneUnique;
import com.ra.base_spring_mvc.validator.user.UsernameUnique;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(name = "username",unique = true)
    @Size(min = 6,max = 100)
    @UsernameUnique
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Username must not contain special characters.")
    private String username;

    @Email
    private String email ;

    @NotBlank(message = "fullname can not blank")
    private String fullName;

    private boolean status ;

    private String password ;

    private String avatar ;

    @Column(name = "phone",unique = true)
    @Pattern(regexp = "^0[35789][0-9]{8}$" , message = "phone not fomat !")
    @PhoneUnique
    private String phone ;

    @NotBlank(message = "address cannot blank")
    private String address ;

    private Date created_at = new Date();

    private Date updated_at ;

    private boolean is_deleted = true;

}
