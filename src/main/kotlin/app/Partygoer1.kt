package app

class Partygoer1(private val partyInformer: PartyInformer) : Partygoer {
    init {
        partyInformer.registerParticipant(this)
    }

    override fun update() {
        musicStateReaction()
    }

    private fun musicStateReaction() {
        when(partyInformer.getMusic()){
            Music.CLASSIC -> println("Beautiful composition!")
            Music.RNB -> println("I like this song!")
            Music.HIP_HOP -> println("This song is in top charts!")
            Music.ROCK -> println("ROCK!")
        }
    }
}