package exercices.s1Basics

object AverageAge {

  /**
    * Code ici la fonction averageAge qui prends en paramètre une liste d'employés et calcule leur âge moyen.
    * Une fois fait, ajoute un paramètre minAge pour ne pas prendre en compte les plus jeunes.
    * Enfin, ajoute un paramètre team qui permette de prendre en compte que les employés de l'équipe, cette fonctionnalités doit être facultative.
    *
    * Des données d'exemple sont fournies dans les tests ;)
    *
    * --------------------------------------------------------
    *
    * EN: Code here "averageAge" function with a list of employees as a parameter and computes the average age.
    * Then, add a "minAge" parameter to filter out the youngest employees.
    * Finally, add a "team" parameter to take into account only team members. This is not mandatory.
    *
    * Test data included in the tests ;)
    *
    */

  case class Employee(name: String, age: Int)

  case class Team(employees: Seq[Employee]) {
    def has(employee: Employee): Boolean = employees.contains(employee)
  }

  def averageAge(employees: Seq[Employee]): Double = {
    employees.map(_.age).sum / employees.size
  }
}
