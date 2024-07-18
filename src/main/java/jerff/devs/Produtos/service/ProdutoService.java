package jerff.devs.Produtos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jerff.devs.Produtos.model.Produto;
import jerff.devs.Produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	   public Produto obterProdutoPorId(Long id) {
	        return produtoRepository.findById(id).orElse(null);
	    }
	    public void deletarProduto(Long id) {
	        produtoRepository.deleteById(id);
	    }
}