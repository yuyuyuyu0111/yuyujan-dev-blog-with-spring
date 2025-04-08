package dev.yuyujan.yuyujandevblogspring.top;

import dev.yuyujan.yuyujandevblogspring.article.Article;
import dev.yuyujan.yuyujandevblogspring.article.ArticleRepository;
import dev.yuyujan.yuyujandevblogspring.constant.AttributeNameConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * トップページの表示を扱うクラス。
 * 最新の記事の一覧を表示したいため、例外的にarticleパッケージに依存する。
 *
 * @author yuyujan
 */
@Controller
public class TopController {
    private final ArticleRepository articleRepository;

    public TopController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(path = {"/", "index"})
    public String top(Model model) {
        List<Article> articles = articleRepository.findAll();
        model.addAttribute(AttributeNameConstants.TITLE, "yuyujan.dev");
        // 見出し用に変換
        articles.forEach(article -> article.setContent(article.getContent().replace("#", "").substring(0, 20)));
        model.addAttribute("articles", articles);
        return "top";
    }

    @GetMapping(path = "about")
    public String about(Model model) {
        model.addAttribute(AttributeNameConstants.TITLE, "About");
        return "about";
    }
}
