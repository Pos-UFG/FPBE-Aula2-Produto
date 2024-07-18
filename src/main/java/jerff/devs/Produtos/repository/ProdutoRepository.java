package jerff.devs.Produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jerff.devs.Produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}