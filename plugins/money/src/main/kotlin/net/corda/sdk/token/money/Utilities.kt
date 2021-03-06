package net.corda.sdk.token.money

import net.corda.core.contracts.Amount
import net.corda.sdk.token.contracts.utilities.AMOUNT

/** Helpers for creating amounts of fixed token definitions. */

// Sterling.
val GBP = FiatCurrency.getInstance("GBP")
fun GBP(amount: Int): Amount<FiatCurrency> = AMOUNT(amount, GBP)
fun GBP(amount: Long): Amount<FiatCurrency> = AMOUNT(amount, GBP)
fun GBP(amount: Double): Amount<FiatCurrency> = AMOUNT(amount, GBP)
val Int.GBP: Amount<FiatCurrency> get() = GBP(this)
val Long.GBP: Amount<FiatCurrency> get() = GBP(this)
val Double.GBP: Amount<FiatCurrency> get() = GBP(this)

// US Dollar.
val USD = FiatCurrency.getInstance("USD")
fun USD(amount: Int): Amount<FiatCurrency> = AMOUNT(amount, USD)
fun USD(amount: Long): Amount<FiatCurrency> = AMOUNT(amount, USD)
fun USD(amount: Double): Amount<FiatCurrency> = AMOUNT(amount, USD)
val Int.USD: Amount<FiatCurrency> get() = USD(this)
val Long.USD: Amount<FiatCurrency> get() = USD(this)
val Double.USD: Amount<FiatCurrency> get() = USD(this)

// Euro.
val EUR = FiatCurrency.getInstance("EUR")
fun EUR(amount: Int): Amount<FiatCurrency> = AMOUNT(amount, EUR)
fun EUR(amount: Long): Amount<FiatCurrency> = AMOUNT(amount, EUR)
fun EUR(amount: Double): Amount<FiatCurrency> = AMOUNT(amount, EUR)
val Int.EUR: Amount<FiatCurrency> get() = EUR(this)
val Long.EUR: Amount<FiatCurrency> get() = EUR(this)
val Double.EUR: Amount<FiatCurrency> get() = EUR(this)

// Swissie.
val CHF = FiatCurrency.getInstance("CHF")

fun CHF(amount: Int): Amount<FiatCurrency> = AMOUNT(amount, CHF)
fun CHF(amount: Long): Amount<FiatCurrency> = AMOUNT(amount, CHF)
fun CHF(amount: Double): Amount<FiatCurrency> = AMOUNT(amount, CHF)
val Int.CHF: Amount<FiatCurrency> get() = CHF(this)
val Long.CHF: Amount<FiatCurrency> get() = CHF(this)
val Double.CHF: Amount<FiatCurrency> get() = CHF(this)

// Japanese Yen.
val JPY = FiatCurrency.getInstance("JPY")

fun JPY(amount: Int): Amount<FiatCurrency> = AMOUNT(amount, JPY)
fun JPY(amount: Long): Amount<FiatCurrency> = AMOUNT(amount, JPY)
fun JPY(amount: Double): Amount<FiatCurrency> = AMOUNT(amount, JPY)
val Int.JPY: Amount<FiatCurrency> get() = JPY(this)
val Long.JPY: Amount<FiatCurrency> get() = JPY(this)
val Double.JPY: Amount<FiatCurrency> get() = JPY(this)

// Bitcoin.
val BTC = DigitalCurrency.getInstance("BTC")
fun BTC(amount: Int): Amount<DigitalCurrency> = AMOUNT(amount, BTC)
fun BTC(amount: Long): Amount<DigitalCurrency> = AMOUNT(amount, BTC)
fun BTC(amount: Double): Amount<DigitalCurrency> = AMOUNT(amount, BTC)
val Int.BTC: Amount<DigitalCurrency> get() = BTC(this)
val Long.BTC: Amount<DigitalCurrency> get() = BTC(this)
val Double.BTC: Amount<DigitalCurrency> get() = BTC(this)