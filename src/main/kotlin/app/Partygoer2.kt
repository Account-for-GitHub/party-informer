package app

class Partygoer2(private val partyInformer: PartyInformer) : Partygoer {
    init {
        partyInformer.registerParticipant(this)
    }

    override fun update() {
        chipsStateReaction()
    }

    private fun chipsStateReaction() {
        val chips = partyInformer.getAmountOfChips()
        when {
            chips < 200 -> println("Hey we need to open more chips!")
            chips > 900 -> println("So many chips!")
        }
    }
}