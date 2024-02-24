import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterData(
    val name: String,
    val picture: String
) : Parcelable