package com.nevicelabs.blog.caracois_neurais.domain;

import org.primefaces.model.LazyDataModel;

import com.nevicelabs.blog.caracois_neurais.persistence.PostagemDAO;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class PostagemBean {
	
	private Postagem postagem = new Postagem();
	private PostagemDAO dao = new PostagemDAO();
	
	public void salvar(Postagem novaPostagem) { dao.adicionar(novaPostagem); }

	public void excluir(Postagem postagem) { dao.excluir(postagem); }

	public List<Postagem> getPostagens() { return dao.getPostagens(); }

	public LazyDataModel<Postagem> getPostagensLazyDataModel() { return dao.getPostagensLazyDataModel(); }

	public Postagem getPostagem(int id) { return dao.getPostagem(id); }

	public Postagem getPostagem() { return this.postagem; }

	public void setPostagem(Postagem post) { this.postagem = post; }

}