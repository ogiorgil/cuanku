package id.ac.ui.akmr.cuanku.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_table")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", updatable = false)
    private int id;

    @Column(name = "is_admin")
    private boolean isAdmin;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "pekerjaan")
    private String pekerjaan;

    // More attributes
}
