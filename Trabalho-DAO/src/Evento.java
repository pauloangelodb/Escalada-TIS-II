
import java.io.Serializable;

import com.google.gson.Gson;

public class Evento implements Comparable<Evento>,Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;
	private String dataInicio;
	private String dataTermino;
//	private LocalDateTime dataInicio;
//	private LocalDateTime dataTermino;
	private String local;
	private int capacidade;
	private int quorum;
	private double orcamentoPrevio;
	private double valorIngresso;
//	private Map <Array,Array> cronograma = new HashMap<Array,Array>();
	private String cronograma;
//	private int convenio[];
	// private Inscricoes = new Inscricao[];
	private String status;

	public Evento(String nome, String inicio, String termino, String local, int capacidade, int quorum,
			double orcamentoPrevio, double valorIngresso, String cronograma, String status) {
		setNome(nome);
		setDataInicio(inicio);
		setDataTermino(termino);
		setLocal(local);
		setCapacidade(capacidade);
		setQuorum(quorum);
		setOrcamentoPrevio(orcamentoPrevio);
		setValorIngresso(valorIngresso);
		setCronograma(cronograma);
		setStatus(status);
	}
	
	@Override
	public int compareTo(Evento evento) {
		return this.getNome().compareToIgnoreCase(evento.getNome());
	}
	
	@Override
	public boolean equals (Object o) {
		if(o instanceof Evento && this.getNome().equalsIgnoreCase(((Evento)o).getNome()))
			return true;
		if(o instanceof String && this.getNome().equalsIgnoreCase((String)o))
			return true;
		return false;
	}

	public String toJson() {
		return new Gson().toJson(this);
//		JSONObject eventojson = new JSONObject();
//		eventojson.put("nome", this.nome);
//		eventojson.put("dataInicio", this.dataInicio);
//		eventojson.put("dataFim", this.dataTermino);
//		eventojson.put("local", this.local);
//		eventojson.put("capacidade", this.capacidade);
//		eventojson.put("minimo", this.quorum);
//		eventojson.put("orcamento", this.orcamentoPrevio);
//		eventojson.put("ingresso", this.valorIngresso);
//		eventojson.put("cronograma", this.cronograma);
////			eventojson.put("convenio", convenio);
//		eventojson.put("status", this.status);
//		return eventojson;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataInicio() {
//		public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
//		public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
//		public LocalDateTime getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
//		public void setDataTermino(LocalDateTime dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuorum() {
		return quorum;
	}

	public void setQuorum(int quorum) {
		this.quorum = quorum;
	}

	public double getOrcamentoPrevio() {
		return orcamentoPrevio;
	}

	public void setOrcamentoPrevio(double orcamentoPrevio) {
		this.orcamentoPrevio = orcamentoPrevio;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public String getCronograma() {
		return cronograma;
	}

	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}

//		public Map <Array,Array> getCronograma() {
//			return cronograma;
//		}
//		
//		public void setCronograma(Map <Array,Array> cronograma) {
//			this.cronograma = cronograma;
//		}
//		
//		public int[] getConvenio() {
//			return convenio;
//		}
//		
//		public void setConvenio(int[] convenio) {
//			this.convenio = convenio;
//		}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}