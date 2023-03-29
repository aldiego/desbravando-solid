package cotuba;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Heading;
import org.commonmark.node.Text;

public class BuildHeaders extends AbstractVisitor {
  private final Capitulo capitulo;

  public BuildHeaders(final Capitulo capitulo) {
    this.capitulo = capitulo;
  }

  @Override
  public void visit(Heading heading) {
    if (heading.getLevel() == 1) {
      // capítulo
      String tituloDoCapitulo = ((Text) heading.getFirstChild()).getLiteral();
      capitulo.setTitulo(tituloDoCapitulo);
    } else if (heading.getLevel() == 2) {
      // seção
    } else if (heading.getLevel() == 3) {
      // título
    }
  }
}
