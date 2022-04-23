package com.vektorel.VektorerSocialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Bir kişiyi takip edenlerin listesi
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tblfollower")
@Entity
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    /**
     * takip edilen kişi
     */
    long userid;
    /**
     * userid yi takip eden kişi
     */
    long followerid;
    int status;

}
