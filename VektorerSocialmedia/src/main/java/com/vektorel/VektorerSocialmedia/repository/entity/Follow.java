package com.vektorel.VektorerSocialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tblfollow")
@Entity
/**
 * Kişinin takip ettigi kullanıcılar
 */
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    long userid;
    /**
     * user kişisinin takip ettiği kullanıcı id si
     */
    long followid;
    /**
     * Eğer bir kişiyi takip etmiyorsa
     * bu değer ya hiç yoktur yada 0 dır.
     * 0-> takip etmiyor
     * 1-> takip ediyor
     * 2-> takip isteğini göndermiş onayda bekliyor
     */

   int status ;
}
