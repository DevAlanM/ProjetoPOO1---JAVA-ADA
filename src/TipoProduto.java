public enum TipoProduto {
    ELETRONICO(1, "eletronico"),
    INFORMATICAEACESSORIOS(2, "informática e acessorios"),
    CASA(3, "casa"),
    LAZERENTRETENIMENTO(4, "lazer e entretenimento"),
    MODABELEZA(5, "moda e beleza");

  private final int id;
  private final String descricao;

  private TipoProduto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
  }
    public static TipoProduto getById(int id){
        for (TipoProduto e: TipoProduto.values()) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new IllegalArgumentException("Não foi possível encontre o tipo de produto pelo id " + id);
    }
    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
}
