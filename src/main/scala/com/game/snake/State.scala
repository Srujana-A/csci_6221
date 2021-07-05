package com.game.snake

sealed trait State

case object Init extends State

case object Running extends State

case object Paused extends State

case object Stopped extends State

