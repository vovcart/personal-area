package com.none.arcades.my_solution.arcades_41_50

object Arcade46 {

  def electionsWinners(votes: Array[Int], votesRemaining: Int): Int = {
    val maxVotes = votes.max
    if (votesRemaining != 0) votes.count(_ + votesRemaining > maxVotes)
    else if (votes.count(_ == maxVotes) > 1) 0
    else 1
  }
}
