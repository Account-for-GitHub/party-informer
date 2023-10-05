import app.*

fun main() {
    val partyInformer = PartyInformerImpl()
    Partygoer1(partyInformer)
    Partygoer2(partyInformer)
    Partygoer3(partyInformer)

    // Show start party info and notify all partygoers about it!:D
    partyInformer.inform()

    partyInformer.loadNewPartyInfo(Music.HIP_HOP, 846, 956)
    partyInformer.loadNewPartyInfo(Music.CLASSIC, 678, 495)
    partyInformer.loadNewPartyInfo(Music.ROCK, 155, 200)
    partyInformer.loadNewPartyInfo(Music.RNB, 1000, 1000)
}