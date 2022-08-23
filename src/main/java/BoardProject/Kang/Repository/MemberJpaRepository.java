package BoardProject.Kang.Repository;

import BoardProject.Kang.domain.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberInfo, Long> {

}
