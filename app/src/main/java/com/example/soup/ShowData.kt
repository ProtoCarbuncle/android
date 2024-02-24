import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ShowData(
    val story: String,
    val episodes: List<EpisodeData>,
    val characterData: List<CharacterData>,
    val year: Int,
    val pictureUrl: String,
    val producer: String,
    val title: String
) : Parcelable