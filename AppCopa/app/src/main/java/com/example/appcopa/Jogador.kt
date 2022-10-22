package com.example.appcopa

var selectedTeam = ""
var selectedPlayer = -1

data class Jogador(
    val nome: String,
    val idade: String,
    val cidade: String,
    val titulos: String,
    val clubes: String,
    val worldcup: String,
    val camisa: String,
    val posicao: String,
    val imageId: Int,
)

val JogadoresBrasil = mutableListOf(
    Jogador("Alisson", "30", "Novo Hamburgo", "titulos", "Liverpool", "Copa do Mundo 2018", "1", "Goleiro", R.drawable.alison),
    Jogador("Eder Militão", "30", "Novo Hamburgo", "titulos", "Liverpool", "Copa do Mundo 2018", "1", "Atacante", R.drawable.eder_militao),
    Jogador("Thiago Silva", "30", "Novo Hamburgo", "titulos", "Liverpool", "Copa do Mundo 2018", "1", "Atacante", R.drawable.thiago_silva),
    Jogador("Marquinhos", "30", "Novo Hamburgo", "titulos", "Liverpool", "Copa do Mundo 2018", "1", "Atacante", R.drawable.marquinhos),
    Jogador("Alex Telles", "30", "Novo Hamburgo", "titulos", "Liverpool", "Copa do Mundo 2018", "1", "Atacante", R.drawable.alex_telles),
    Jogador("Casemiro", "30", "São José dos Campos", "titulos", "Manchester United", "Copa do Mundo 2018", "5", "Meio Campo", R.drawable.casemiro),
    Jogador("Lucas Paquetá", "30", "São José dos Campos", "titulos", "Manchester United", "Copa do Mundo 2018", "5", "Meio Campo", R.drawable.lucas_paqueta),
    Jogador("Neymar", "30", "Mogi das Cruzes", "titulos", "Paris Saint German (PSG)", "Copa do Mundo 2014 e 2018", "10", "Atacante", R.drawable.neymar),
    Jogador("Raphinha", "30", "Mogi das Cruzes", "titulos", "Paris Saint German (PSG)", "Copa do Mundo 2014 e 2018", "10", "Atacante", R.drawable.raphinha),
    Jogador("Vini Junior", "30", "Mogi das Cruzes", "titulos", "Paris Saint German (PSG)", "Copa do Mundo 2014 e 2018", "10", "Atacante", R.drawable.vini_junior),
    Jogador("Richarlison", "30", "Mogi das Cruzes", "titulos", "Paris Saint German (PSG)", "Copa do Mundo 2014 e 2018", "10", "Atacante", R.drawable.richarlison),
)

val JogadoresServia = mutableListOf(
    Jogador("Predrag Rajkovic", " 26", " Negotin", " titulos", "  Stade Rennes", " estreia", " 1", "goleiro", R.drawable.rs),
    Jogador("Nikola Milenkovic", " 25", " Belgrado", " titulos", " Fiorentina", " estreia", " 2", "zagueiro", R.drawable.rs),
    Jogador("Matija Nastasic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "zagueiro", R.drawable.rs),
    Jogador("Strahinja Pavlovic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "zagueiro", R.drawable.rs),
    Jogador("Nemanja Gudelj", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "meio campo", R.drawable.rs),
    Jogador("Sasa Lukic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "meio campo", R.drawable.rs),
    Jogador("Sergej Milinkovic-Savic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "meio campo", R.drawable.rs),
    Jogador("Filip Kostic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "meio campo", R.drawable.rs),
    Jogador("Dusan Tadic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "atacante", R.drawable.rs),
    Jogador("Dusan Vlahovic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "atacante", R.drawable.rs),
    Jogador("Aleksandar Mitrovic", " 28", " semendria", " titulos", " FC Fulham", "copa de 2018", "9", "atacante", R.drawable.rs),
)

val JogadoresSuica = mutableListOf(
    Jogador("Yann Sommer", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "goleiro", R.drawable.ch),
    Jogador("Manuel Akanji", "27 anos", "Wiesendangen", "titulos", "Manchester City", "estreia", "5", "zagueiro", R.drawable.ch),
    Jogador("Nico Elvedi", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "zagueiro", R.drawable.ch),
    Jogador("Silvan Widmer", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "zagueiro", R.drawable.ch),
    Jogador("Ricardo Rodriguez", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "zagueiro", R.drawable.ch),
    Jogador("Granit Xhaka", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "meio campo", R.drawable.ch),
    Jogador("Remo Freuler", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "meio campo", R.drawable.ch),
    Jogador("Xherdan Shaqiri", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "meio campo", R.drawable.ch),
    Jogador("Ruben Vargas", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "meio campo", R.drawable.ch),
    Jogador("Renato Steffen", "33", "Morges", "titulos", "Borussia Mönchengladbach", "estreia", "1", "meio campo", R.drawable.ch),
    Jogador("Breel Emobolo", "25", "Yaounde", "titulos", "Monaco", "Copa do Mundo 2018", "7", "atacante", R.drawable.ch),
)

val JogadoresCamaroes = mutableListOf(
    Jogador("André Onana", "26 ", "Ngok ", "titulos ", "Inter de Milão", "estreia", "1", "Goleiro", R.drawable.cm),
    Jogador("Christopher Wooh", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Zagueiro", R.drawable.cm),
    Jogador("Jean Onana", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Zagueiro", R.drawable.cm),
    Jogador("Jean-Charles Castelletto", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Zagueiro", R.drawable.cm),
    Jogador("Nicolas N'Koulou", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Zagueiro", R.drawable.cm),
    Jogador("Gaël Ondoua", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Meio campo", R.drawable.cm),
    Jogador("Georges Mandjeck", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Meio campo", R.drawable.cm),
    Jogador("Pierre Kunde", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Meio campo", R.drawable.cm),
    Jogador("Bryan Mbeumo", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Atacante", R.drawable.cm),
    Jogador("Jean-Pierre Nsame", "29", "Louvres", "titulos", "Rennes", "estreia", "9", "Atacante", R.drawable.cm),
    Jogador("Vincent Aboubakar", "30", "Yaounde", "titulos", "Al-Nassr", "estreia", "10 ", "Atacante", R.drawable.cm),
)