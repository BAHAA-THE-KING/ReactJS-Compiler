class asd {
   dsa = "asd";
   sad;
   constructor(sad) {
      this.sad = sad;
   }
   print() {
      return this.sad;
   }
}
class koko extends asd {
   constructor(props) {
      super(props);
      this.lolo = "soso";
   }
   DontPrint() {
      return this.sad + this.lolo;
   }
}