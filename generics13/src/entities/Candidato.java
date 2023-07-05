package entities;

import java.util.Objects;

public class Candidato {
	private String name;
	private Integer votes;
	public Candidato(String name, Integer votes) {
		super();
		this.name = name;
		this.votes = votes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, votes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(name, other.name) && Objects.equals(votes, other.votes);
	}
	@Override
	public String toString() {
		return "Candidato [name=" + name + ", votes=" + votes + "]";
	}
	
	
}
