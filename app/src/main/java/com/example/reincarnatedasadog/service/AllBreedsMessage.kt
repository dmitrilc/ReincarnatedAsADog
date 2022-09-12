package com.example.reincarnatedasadog.service

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.reflect.KCallable

@JsonClass(generateAdapter = true)
class AllBreedsMessage {
    @Json(name = "affenpinscher")
    var affenpinscher: List<String>? = null

    @Json(name = "african")
    var african: List<String>? = null

    @Json(name = "airedale")
    var airedale: List<String>? = null

    @Json(name = "akita")
    var akita: List<String>? = null

    @Json(name = "appenzeller")
    var appenzeller: List<String>? = null

    @Json(name = "australian")
    var australian: List<String>? = null

    @Json(name = "basenji")
    var basenji: List<String>? = null

    @Json(name = "beagle")
    var beagle: List<String>? = null

    @Json(name = "bluetick")
    var bluetick: List<String>? = null

    @Json(name = "borzoi")
    var borzoi: List<String>? = null

    @Json(name = "bouvier")
    var bouvier: List<String>? = null

    @Json(name = "boxer")
    var boxer: List<String>? = null

    @Json(name = "brabancon")
    var brabancon: List<String>? = null

    @Json(name = "briard")
    var briard: List<String>? = null

    @Json(name = "buhund")
    var buhund: List<String>? = null

    @Json(name = "bulldog")
    var bulldog: List<String>? = null

    @Json(name = "bullterrier")
    var bullterrier: List<String>? = null

    @Json(name = "cattledog")
    var cattledog: List<String>? = null

    @Json(name = "chihuahua")
    var chihuahua: List<String>? = null

    @Json(name = "chow")
    var chow: List<String>? = null

    @Json(name = "clumber")
    var clumber: List<String>? = null

    @Json(name = "cockapoo")
    var cockapoo: List<String>? = null

    @Json(name = "collie")
    var collie: List<String>? = null

    @Json(name = "coonhound")
    var coonhound: List<String>? = null

    @Json(name = "corgi")
    var corgi: List<String>? = null

    @Json(name = "cotondetulear")
    var cotondetulear: List<String>? = null

    @Json(name = "dachshund")
    var dachshund: List<String>? = null

    @Json(name = "dalmatian")
    var dalmatian: List<String>? = null

    @Json(name = "dane")
    var dane: List<String>? = null

    @Json(name = "deerhound")
    var deerhound: List<String>? = null

    @Json(name = "dhole")
    var dhole: List<String>? = null

    @Json(name = "dingo")
    var dingo: List<String>? = null

    @Json(name = "doberman")
    var doberman: List<String>? = null

    @Json(name = "elkhound")
    var elkhound: List<String>? = null

    @Json(name = "entlebucher")
    var entlebucher: List<String>? = null

    @Json(name = "eskimo")
    var eskimo: List<String>? = null

    @Json(name = "finnish")
    var finnish: List<String>? = null

    @Json(name = "frise")
    var frise: List<String>? = null

    @Json(name = "germanshepherd")
    var germanshepherd: List<String>? = null

    @Json(name = "greyhound")
    var greyhound: List<String>? = null

    @Json(name = "groenendael")
    var groenendael: List<String>? = null

    @Json(name = "havanese")
    var havanese: List<String>? = null

    @Json(name = "hound")
    var hound: List<String>? = null

    @Json(name = "husky")
    var husky: List<String>? = null

    @Json(name = "keeshond")
    var keeshond: List<String>? = null

    @Json(name = "kelpie")
    var kelpie: List<String>? = null

    @Json(name = "komondor")
    var komondor: List<String>? = null

    @Json(name = "kuvasz")
    var kuvasz: List<String>? = null

    @Json(name = "labradoodle")
    var labradoodle: List<String>? = null

    @Json(name = "labrador")
    var labrador: List<String>? = null

    @Json(name = "leonberg")
    var leonberg: List<String>? = null

    @Json(name = "lhasa")
    var lhasa: List<String>? = null

    @Json(name = "malamute")
    var malamute: List<String>? = null

    @Json(name = "malinois")
    var malinois: List<String>? = null

    @Json(name = "maltese")
    var maltese: List<String>? = null

    @Json(name = "mastiff")
    var mastiff: List<String>? = null

    @Json(name = "mexicanhairless")
    var mexicanhairless: List<String>? = null

    @Json(name = "mix")
    var mix: List<String>? = null

    @Json(name = "mountain")
    var mountain: List<String>? = null

    @Json(name = "newfoundland")
    var newfoundland: List<String>? = null

    @Json(name = "otterhound")
    var otterhound: List<String>? = null

    @Json(name = "ovcharka")
    var ovcharka: List<String>? = null

    @Json(name = "papillon")
    var papillon: List<String>? = null

    @Json(name = "pekinese")
    var pekinese: List<String>? = null

    @Json(name = "pembroke")
    var pembroke: List<String>? = null

    @Json(name = "pinscher")
    var pinscher: List<String>? = null

    @Json(name = "pitbull")
    var pitbull: List<String>? = null

    @Json(name = "pointer")
    var pointer: List<String>? = null

    @Json(name = "pomeranian")
    var pomeranian: List<String>? = null

    @Json(name = "poodle")
    var poodle: List<String>? = null

    @Json(name = "pug")
    var pug: List<String>? = null

    @Json(name = "puggle")
    var puggle: List<String>? = null

    @Json(name = "pyrenees")
    var pyrenees: List<String>? = null

    @Json(name = "redbone")
    var redbone: List<String>? = null

    @Json(name = "retriever")
    var retriever: List<String>? = null

    @Json(name = "ridgeback")
    var ridgeback: List<String>? = null

    @Json(name = "rottweiler")
    var rottweiler: List<String>? = null

    @Json(name = "saluki")
    var saluki: List<String>? = null

    @Json(name = "samoyed")
    var samoyed: List<String>? = null

    @Json(name = "schipperke")
    var schipperke: List<String>? = null

    @Json(name = "schnauzer")
    var schnauzer: List<String>? = null

    @Json(name = "setter")
    var setter: List<String>? = null

    @Json(name = "sharpei")
    var sharpei: List<String>? = null

    @Json(name = "sheepdog")
    var sheepdog: List<String>? = null

    @Json(name = "shiba")
    var shiba: List<String>? = null

    @Json(name = "shihtzu")
    var shihtzu: List<String>? = null

    @Json(name = "spaniel")
    var spaniel: List<String>? = null

    @Json(name = "springer")
    var springer: List<String>? = null

    @Json(name = "stbernard")
    var stbernard: List<String>? = null

    @Json(name = "terrier")
    var terrier: List<String>? = null

    @Json(name = "tervuren")
    var tervuren: List<String>? = null

    @Json(name = "vizsla")
    var vizsla: List<String>? = null

    @Json(name = "waterdog")
    var waterdog: List<String>? = null

    @Json(name = "weimaraner")
    var weimaraner: List<String>? = null

    @Json(name = "whippet")
    var whippet: List<String>? = null

    @Json(name = "wolfhound")
    var wolfhound: List<String>? = null

    val fields: List<KCallable<*>>
        get() = this::class
            .members
            .filterNot {
                it.name == "equals" ||
                it.name == "hashCode" ||
                it.name == "toString" ||
                it.name == "fields"
        }
}