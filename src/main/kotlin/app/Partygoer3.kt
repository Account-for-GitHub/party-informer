package app

class Partygoer3(private val partyInformer: PartyInformer) : Partygoer {
    init {
        partyInformer.registerParticipant(this)
    }

    override fun update() {
        beveragesStateReaction()
    }

    private fun beveragesStateReaction() {
        val beverages = partyInformer.getAmountOfBeverages()
        when {
            beverages < 300 -> println("Let's get more beverages!")
            beverages > 900 -> println("Let's drink some beverages!")
        }
    }
}