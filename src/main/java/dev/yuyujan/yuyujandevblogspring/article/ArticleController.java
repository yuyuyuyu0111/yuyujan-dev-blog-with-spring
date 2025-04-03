package dev.yuyujan.yuyujandevblogspring.article;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 記事の検索、表示を担当するコントローラー。
 * 責務が多いと感じた場合、コントローラーは分割する。
 *
 * @author yuyujan
 */
@Controller
@RequestMapping(path = "/article")
public class ArticleController {
    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("{id}")
    public String article(@PathVariable String id, Model model) {

        Long articleId = Long.parseLong(id);
        var article = articleRepository.findById(articleId).orElseThrow(() ->
                new NotFoundArticleException(articleId)
        );
        model.addAttribute("article", article);

        Parser parser = Parser.builder().build();
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        Document document = parser.parse(article.getContent());
        String renderedContents = renderer.render(document);
        model.addAttribute("renderedContents",renderedContents );

        return "article";
    }


}
