/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "MST_USER")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"password"})
public class UserMstDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "username", length = 30, nullable = false)
  private String username;

  @Column(name = "password", length = 120, nullable = false)
  private String password;

  @Column(name = "role", length = 10, nullable = false)
  private String role;
}
