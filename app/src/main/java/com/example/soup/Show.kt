import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Show(
    val story: String,
    val episodes: List<Episode>,
    val characters: List<Character>,
    val year: Int,
    val pictureUrl: String,
    val producer: String,
    val title: String
) : Parcelable