package it.pokemonclash.pcbattler.entities;

import javax.persistence.*;


import java.sql.Timestamp;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="id")
    //private Role role;

    private Timestamp last_connection;

    public User(){

    }

    public User(String nickname){
        this.nickname = nickname;
        this.last_connection = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Long getId(){
        return id;
    }

    // public void setId(Long id){
    //     this.id = id;
    // }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    // public Role getRole(){
    //     return role;
    // }

    // public void setRole(Role role){
    //     this.role = role;
    // }


    public Timestamp getLast_connection() {
        return last_connection;
    }

    public void setLast_connection(Timestamp last_connection) {
        this.last_connection = last_connection;
    }
}
