package dev.yuyujan.yuyujandevblogspring.articletag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTagRepository extends JpaRepository<ArticleTag, Long> {
}
