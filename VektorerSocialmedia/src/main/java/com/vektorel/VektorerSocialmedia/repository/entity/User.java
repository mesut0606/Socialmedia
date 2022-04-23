package com.vektorel.VektorerSocialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * POJO ile ilgili eklenmesi gereken kodların
 * karmaşıklığını azaltmak ve daha kolay bir
 * kullanım sağlamak amacıyla Lombok Porject
 * geliştirilmiştir. Kullanım için anatasyonlarını
 * eklemek yeterlidir.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table (name = "tbluser")
@Entity

public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String username;
    String borndate;
    String email;
    String phone;
    String avatar;
    String phonetoken;
    long createprofile;
}
