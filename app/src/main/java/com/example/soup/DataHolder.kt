import java.util.Date

fun createSeriesList(): List<ShowData> {
    val seriesList = mutableListOf<ShowData>()

    val show1 = ShowData(
        story = "Story of Show 1",
        episodes = listOf(
            EpisodeData("https://example.com/show1/episode1", "Episode 1", 1, Date(2013)),
            EpisodeData("https://example.com/show1/episode2", "Episode 2", 2, Date(2013)),

        ),
        characterData = listOf(
            CharacterData("Character 1", "https://example.com/show1/character1"),
            CharacterData("Character 2", "https://example.com/show1/character2"),

        ),
        year = 2012,
        pictureUrl = "https://example.com/show1.jpg",
        producer = "Producer of Show 1",
        title = "Show 1"
    )
    seriesList.add(show1)

    val show2 = ShowData(
        story = "Story of Show 2",
        episodes = listOf(
            EpisodeData("https://example.com/show2/episode1", "Episode 1", 1, Date(2013)),
            EpisodeData("https://example.com/show2/episode2", "Episode 2", 2, Date(2013)),

        ),
        characterData = listOf(
            CharacterData("Character 1", "https://example.com/show2/character1"),
            CharacterData("Character 2", "https://example.com/show2/character2"),

        ),
        year = 2011,
        pictureUrl = "https://example.com/show2.jpg",
        producer = "Producer of Show 2",
        title = "Show 2"
    )
    seriesList.add(show2)



    return seriesList
}

fun main() {
    val createdSeriesList = createSeriesList()
    println(createdSeriesList)
}
