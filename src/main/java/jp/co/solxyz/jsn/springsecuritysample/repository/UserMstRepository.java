/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.repository;

import jp.co.solxyz.jsn.springsecuritysample.dto.UserMstDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** ユーザマスタリポジトリ */
@Repository
public interface UserMstRepository extends JpaRepository<UserMstDto, Long> {
  UserMstDto findByUsername(String username);
}
