package myPackage;

public class DistanceInterVille {

	public static void main(String[] args) {
		String depart, arrive, input;
		int departIndex, arriveIndex, dist;
		
		boolean fin = false;
		String ville[] = {"brest","grenoble","lille","lyon","marseille","nantes","paris","rennes","strasbourg","toulouse"};
		int distance[][] = {{0,996,723,890,1286,305,564,245,1026,884},{-1,0,750,104,286,711,576,747,505,543},{-1,-1,0,668,979,593,224,515,524,905},{-1,-1,-1,0,316,607,472,645,434,467},{-1,-1,-1,-1,0,890,769,938,750,400},{-1,-1,-1,-1,-1,0,386,106,832,559},{-1,-1,-1,-1,-1,-1,0,348,447,681},{-1,-1,-1,-1,-1,-1,-1,0,799,665},{-1,-1,-1,-1,-1,-1,-1,-1,0,901},{-1,-1,-1,-1,-1,-1,-1,-1,-1,0}};
		
		
		System.out.println("Bienvenue dans le programme d'obtention de distance inter villes, voici la liste des ville disponible");
		System.out.println(" - Brest	- Nantes");
		System.out.println(" - Grenoble	- Paris");
		System.out.println(" - Lille	- Rennes");
		System.out.println(" - Lyon		- Strasbourg");
		System.out.println(" - Marseille	- Toulouse");
		System.out.println(" ");
		
		
		while(!fin)
		{			
			depart = Saisie.lire_String("Quelle est votre ville de départ ?");
			departIndex = indexVille(ville,depart);
			while (departIndex == -1)
			{
				depart = Saisie.lire_String("Erreur, la ville que vous avez saisie n'est pas référencé, veuillez saisir votre ville de départ ?");
				departIndex = indexVille(ville,depart);
			}
			
			arrive = Saisie.lire_String("Quelle est votre ville d'arrivé ?");
			arriveIndex = indexVille(ville,arrive);
			while (arriveIndex == -1)
			{
				arrive = Saisie.lire_String("Erreur, la ville que vous avez saisie n'est pas référencé, veuillez saisir votre ville de arrive ?");
				arriveIndex = indexVille(ville,arrive);
			}
			
			
			dist = distance[departIndex][arriveIndex];
			if (dist == -1) dist = distance[arriveIndex][departIndex];
			
			System.out.println("La distance entre " + depart + " et " + arrive + " est de " + dist + "km");
			
			
			input = Saisie.lire_String("Souhaitez vous continuer ? (oui/non)");
			while (!input.equals("oui") && !input.equals("non"))
			{
				input = Saisie.lire_String("Erreur, souhaitez vous continuer ? (oui/non)");
			}
			if (input.equals("non")) fin = true;
		}
	}
	
	static int indexVille(String listVille[], String ville)
	{
		int i;
		
		for(i = 0; i < listVille.length; i++)
		{
			if(ville.equals(listVille[i])) return i;
		}
		
		return -1;
	}
}
