package br.ufrn.imd.domino;

/**
 * Classe que representa o curso que pode ser, por exemplo: BTI, ECT.
 * @author itami
 *
 */
public class Curso {

	private int id;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
