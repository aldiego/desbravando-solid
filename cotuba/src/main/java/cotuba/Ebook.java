package cotuba;

import java.nio.file.Path;
import java.util.List;

public record Ebook(String formato, Path arquivoDeSaida, List<Capitulo> capitulos) {

  public boolean isUltimoCapitulo(Capitulo capitulo) {
    return this.capitulos.get(this.capitulos.size() - 1).equals(capitulo);
  }
}
