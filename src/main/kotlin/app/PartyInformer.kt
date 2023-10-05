package app

abstract class PartyInformer {
    private val partygoers: MutableList<Partygoer> = mutableListOf()

    private var music: Music = Music.RNB
    private var amountOfChips = 1000
    private var amountOfBeverages = 1000

    fun registerParticipant(partygoer: Partygoer) {
        partygoers.add(partygoer)
    }

    fun removeParticipant(partygoer: Partygoer) {
        partygoers.remove(partygoer)
    }

    fun loadNewPartyInfo(newMusic: Music, newAmountOfChips: Int, newAmountOfBeverages: Int) {
        music = newMusic
        amountOfChips = newAmountOfChips
        amountOfBeverages = newAmountOfBeverages
        inform()
    }

    fun inform(){
        showPartyInfo()
        notifyParticipants()
    }

    private fun showPartyInfo(){
        println("-----------------")
        println("Party Info: ")
        println("Music: ${music.type}")
        println("Amount of chips: $amountOfChips")
        println("Amount of beverages: $amountOfBeverages")
        println("-----------------")

    }

    private fun notifyParticipants() {
        partygoers.forEach { it.update() }
    }

    fun getMusic() = music
    fun getAmountOfChips() = amountOfChips
    fun getAmountOfBeverages() = amountOfBeverages
}