package br.edu.unifacear.catalogoautomotivo.entity;

public enum Sexo {
	M("Masculino"), F("Feminino");

	private String label;

	private Sexo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
