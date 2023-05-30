// function solution(array, height) {
//     var answer = 0;

//     for (i = 0; i < array.length; i++) {
//         if (array[i] > height ) {
//          answer += 1;
// }   
// }
//     return answer;
// }
// console.log(solution([149, 180, 192, 170], 167));



function solution(array, height) {

    return array.filter(ddddd => ddddd > height).length;


}

  

console.log(solution([149, 180, 192, 170], 167));