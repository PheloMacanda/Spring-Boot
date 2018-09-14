// The convert script is responsible for all the conversions
// Phelo Macanda

/*
 * This code converts feet to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num / 0.0022046;
}

/*
 * This code converts inches to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num / 39.370;
}

/*
 * This code converts miles to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num / 0.00062137;
}

/*
 * This code converts centimetres to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num / 100;
}

/*
 * This code converts kilomotres to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num * 1000;
}

/*
 * This code converts metres to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num*1;
}

/*
 * This code converts milimetres to metres
 */
function lengthConverter(num) {
    document.getElementById("outputMeters").innerHTML = num / 1000;
}