import Show
import Character
import Episode
import java.util.Date

fun createSeriesList(): MutableList<Show> {
    val seriesList = mutableListOf<Show>()

    for (i in 1..10) {
        val episodes = mutableListOf<Episode>()
        for (j in 1..10) {
            episodes.add(Episode("Episode $j", "Episode $j", j, Date(2013,10,1)))
        }

        val characters = mutableListOf<Character>()
        for (k in 1..5) {
            characters.add(Character("Character $k", "Character $k"))
        }

        seriesList.add(
            Show(
                story = "Story of Show $i",
                episodes = episodes,
                characters = characters,
                year = 2022 - i, // Adjusting the year for demo purposes
                pictureUrl = "https://example.com/show$i.jpg", // Placeholder URL
                producer = "Producer of Show $i",
                title = "Show $i"
            )
        )
    }

    return seriesList
}


val SHIELDData = Show(
    story = "The missions of the Strategic Homeland Intervention, Enforcement and Logistics Division. A small team of operatives led by Agent Coulson (Clark Gregg) who must deal with the strange new world of \"superheroes\" after the \"Battle of New York\", protecting the public from new and unknown threats.",
    episodes = mutableListOf<Episode>(
        Episode("https://comicvine.gamespot.com/agents-of-shield-101-pilot/4070-1/", "Pilot", 1, Date(2013,9,24)),
        Episode("https://comicvine.gamespot.com/agents-of-shield-102-0-8-4/4070-2/", "0-8-4", 2, Date(2013,10,1)),
        Episode("https://comicvine.gamespot.com/agents-of-shield-103-the-asset/4070-3/o", "The Asset", 3, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-104-eye-spy/4070-3251/", "Eye Spy", 4, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-105-girl-in-the-flower-dress/4070-3547/", "Girl in the Flower Dress", 5, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-106-f-z-z-t/4070-4072/", "F.Z.Z.T", 6, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-107-the-hub/4070-4297/", "The Hub", 7, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-108-the-well/4070-4320/", "The Well", 8, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-109-repairs/4070-4622/", "Repairs", 9, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-110-the-bridge/4070-4629/", "The Bridge", 10, Date(2013,10,8)),
    ),
    characters = mutableListOf<Character>(
        Character("Jemma Simmons", "https://comicvine.gamespot.com/jemma-simmons/4005-105831/"),
        Character("Quake", "https://comicvine.gamespot.com/quake/4005-43174/"),
        Character( "Melinda May", "https://comicvine.gamespot.com/melinda-may/4005-105830/"),
        Character( "Phil Coulson", "https://comicvine.gamespot.com/phil-coulson/4005-70860/"),
        Character( "Leo Fitz", "https://comicvine.gamespot.com/leo-fitz/4005-105832/"),
        Character( "Al MacKenzie", "https://comicvine.gamespot.com/al-mackenzie/4005-59793/"),
        Character( "SlingShot", "https://comicvine.gamespot.com/slingshot/4005-54525/"),
        Character( "Grant Ward", "https://comicvine.gamespot.com/grant-ward/4005-105833/"),
        Character( "Lance Hunter", "https://comicvine.gamespot.com/lance-hunter/4005-9122/"),
        Character( "Mockingbird", "https://comicvine.gamespot.com/mockingbird/4005-2497/")
    ),
    year = 2013, // Adjusting the year for demo purposes
    pictureUrl = "https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6238345-3060875932-35677.jpg",
    producer = "Marvel",
    title = "Agents of S.H.I.E.L.D"
)