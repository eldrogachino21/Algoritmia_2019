import java.util.ArrayList;
import java.util.List;

/**
 * @author raidentrance
 *
 */
public class Nodo {
	private String nombre;
	private List<Arista> aristas;

	public Nodo(String city) {
		this.nombre = city;
	}

	public String getCity() {
		return nombre;
	}

	public void setCity(String city) {
		this.nombre = city;
	}

	public List<Arista> getEdges() {
		return aristas;
	}

	public void addEdge(Arista edge) {
		if (aristas == null) {
			aristas = new ArrayList<>();
		}
		aristas.add(edge);
	}

	@Override
	public String toString() {
		return "\n \tNode [nodo=" + nombre + ", bordes=" + aristas + "]";
	}
}